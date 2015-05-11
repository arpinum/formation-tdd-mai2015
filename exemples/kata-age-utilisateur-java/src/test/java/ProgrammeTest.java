import es.EntréeStandard;
import mocks.MockSortieStandard;
import mocks.StubEntréeStandard;
import mocks.StubTemps;
import org.junit.Test;
import outils.Temps;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class ProgrammeTest {

    @Test
    public void doitDemanderLaDateDeNaissanceDeLUtilisateurPourAfficherSonAge() {
        EntréeStandard entréeStandard = new StubEntréeStandard("27/04/1983");
        MockSortieStandard sortieStandard = new MockSortieStandard();
        Temps temps = new StubTemps(LocalDate.of(2015, 5, 11));
        Programme programme = new Programme(entréeStandard, sortieStandard, temps);

        programme.exécuteToi();

        assertThat(sortieStandard.affichages).contains("Vous avez 32 ans");
    }

}
