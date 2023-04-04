package processor;

import dominio.Cliente;
import dominio.FaturaCartaoCredito;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;
//import org.springframework.http.ResponseEntity;

@Component
public class CarregarDadosClienteProcessor implements ItemProcessor<FaturaCartaoCredito, FaturaCartaoCredito> {

//    private RestTemplate restTemplate = new RestTemplate();
    @Override
    public FaturaCartaoCredito process(FaturaCartaoCredito faturaCartaoCredito) throws Exception {
        String uri = String.format("http://my-json-server.typicode.com/giuliana-bezerra/demo/profile/%d", faturaCartaoCredito.getCliente().getId());
       // ResponseEntity<Cliente> response = restTemplte.getForEntity(uri, Cliente.class);

//        if (response.g)
        return faturaCartaoCredito;
    }
}
