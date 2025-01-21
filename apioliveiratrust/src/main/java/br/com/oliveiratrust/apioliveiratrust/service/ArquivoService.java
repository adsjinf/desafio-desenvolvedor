package br.com.oliveiratrust.apioliveiratrust.service;

import br.com.oliveiratrust.apioliveiratrust.entity.ArquivoEntity;
import br.com.oliveiratrust.apioliveiratrust.entity.ItemArquivoEntity;
import br.com.oliveiratrust.apioliveiratrust.listener.dto.OliveiraTrustCreatedEvent;
import br.com.oliveiratrust.apioliveiratrust.repository.ArquivoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArquivoService {

    private final ArquivoRepository arquivoRepository;

    public ArquivoService(ArquivoRepository arquivoRepository) {
        this.arquivoRepository = arquivoRepository;
    }

    public void save(OliveiraTrustCreatedEvent event) {

        var entity = new ArquivoEntity();
        entity.setArquivoId(event.arquivoId());
        entity.setNome(event.nomeArquivo());
        entity.setUsuario(event.usuario());
        entity.setItens(getItens(event));

        arquivoRepository.save(entity);
    }

    private static List<ItemArquivoEntity> getItens(OliveiraTrustCreatedEvent event) {

        return event.itens().stream()
                .map(i -> new ItemArquivoEntity(
                        i.rptDt(),
                        i.tckrSymb(),
                        i.asst(),
                        i.asstDesc(),
                        i.sgmtNm(),
                        i.mktNm(),
                        i.sctyCtgyNm(),
                        i.xprtnDt(),
                        i.xprtnCd(),
                        i.tradgStartDt(),
                        i.tradgEndDt(),
                        i.baseCd(),
                        i.convsCritNm(),
                        i.mtrtyDtTrgtPt(),
                        i.reqrdConvsInd(),
                        i.isin(),
                        i.cfiCd(),
                        i.dlvryNtceStartDt(),
                        i.dlvryNtceEndDt(),
                        i.optnTp(),
                        i.ctrctMltplr(),
                        i.asstQtnQty(),
                        i.allcnRndLot(),
                        i.tradgCcy(),
                        i.dlvryTpNm(),
                        i.wdrwlDays(),
                        i.wrkgDays(),
                        i.clnrDays(),
                        i.rlvrBasePricNm(),
                        i.opngFutrPosDay(),
                        i.sdTpCd1(),
                        i.undrlygTckrSymb1(),
                        i.sdTpCd2(),
                        i.undrlygTckrSymb2(),
                        i.pureGoldWght(),
                        i.exrcPric(),
                        i.optnStyle(),
                        i.valTpNm(),
                        i.prmUpfrntInd(),
                        i.opngPosLmtDt(),
                        i.dstrbtnId(),
                        i.pricFctr(),
                        i.daysToSttlm(),
                        i.srsTpNm(),
                        i.prtcnFlg(),
                        i.automtcExrcInd(),
                        i.spcfctnCd(),
                        i.crpnNm(),
                        i.corpActnStartDt(),
                        i.ctdyTrtmntTpNm(),
                        i.mktCptlstn(),
                        i.corpGovnLvlNm()))
                .toList();
    }
}
