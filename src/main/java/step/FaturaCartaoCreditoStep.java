package step;

import dominio.FaturaCartaoCredito;
import dominio.Transacao;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import reader.FaturaCartaoCreditoReader;


public class FaturaCartaoCreditoStep {

    @Bean
    public Step faturaCartaoCreditoStep(ItemStreamReader<Transacao> lerTransacoesReader,
                                        ItemProcessor<FaturaCartaoCredito, FaturaCartaoCredito> carregarDadosClienteProcessor,
                                        ItemWriter<FaturaCartaoCredito> escreverFaturaCartaoCredito,
                                        JobRepository jobRepository){
        return new StepBuilder( "faturaCartaoCreditoStep", jobRepository)
                .<FaturaCartaoCredito, FaturaCartaoCredito>chunk(1)
                .reader(new FaturaCartaoCreditoReader(lerTransacoesReader))
                .processor(carregarDadosClienteProcessor)
                .writer(escreverFaturaCartaoCredito)
                .build();
                
    }


}
