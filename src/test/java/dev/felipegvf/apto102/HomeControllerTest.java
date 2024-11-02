package dev.felipegvf.apto102;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;

import static org.mockito.Mockito.mock;

class HomeControllerTest {

    @Test
    void home() {

        // given
        var model = mock(Model.class);
        HomeController homeController = new HomeController();

        // when
        var home = homeController.home(model);

        // then
        Assertions.assertThat(home).isEqualTo("index");

    }

}