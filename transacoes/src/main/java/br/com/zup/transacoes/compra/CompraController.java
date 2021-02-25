package br.com.zup.transacoes.compra;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transacoes/")
public class CompraController {

    @GetMapping("/compras/{idCartao}")
    public ResponseEntity<?> consultaComprasRecentes(@PathVariable String idCartao){

        return ResponseEntity.ok(idCartao);
    }
}
