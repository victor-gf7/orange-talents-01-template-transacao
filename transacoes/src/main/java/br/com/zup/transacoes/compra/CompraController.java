package br.com.zup.transacoes.compra;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/transacoes/")
public class CompraController {

    private final TransacaoRepository transacaoRepository;

    public CompraController(TransacaoRepository transacaoRepository) {
        this.transacaoRepository = transacaoRepository;
    }

    @GetMapping("/compras/{idCartao}")
    public ResponseEntity<?> consultaComprasRecentes(@PathVariable String idCartao){

        List<Transacao> ultimasDezCompras = new ArrayList<>();
        ultimasDezCompras.addAll(transacaoRepository.findTop10ByCartao_idCartaoOrderByEfetivadaEmDesc(idCartao));

        if(ultimasDezCompras.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(ultimasDezCompras);
    }
}
