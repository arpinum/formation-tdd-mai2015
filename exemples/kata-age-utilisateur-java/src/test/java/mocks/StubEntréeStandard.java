package mocks;

import es.EntréeStandard;

public class StubEntréeStandard implements EntréeStandard {
    public StubEntréeStandard(String dateSaisie) {
        this.dateSaisie = dateSaisie;
    }

    @Override
    public String lis() {
        return dateSaisie;
    }

    private String dateSaisie;
}
