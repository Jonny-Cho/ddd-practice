package kitchenpos.application.fixture;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kitchenpos.domain.Menu;

public class MenuFixture {

    private static final String MENU_NAME1 = "후라이드";
    private static final String MENU_NAME2 = "양념";
    private static final long PRICE1 = 20000L;
    private static final long PRICE2 = 30000L;
    private static final long NEGATIVE_PRICE = -10000L;
    private static final UUID UUID1 = UUID.randomUUID();
    private static final UUID UUID2 = UUID.randomUUID();
    private static final UUID MENU_GROUP_ID1 = UUID.randomUUID();
    private static final UUID MENU_GROUP_ID2 = UUID.randomUUID();

    public static Menu MENU1() {
        final Menu menu = new Menu();
        menu.setId(UUID1);
        menu.setName(MENU_NAME1);
        menu.setPrice(BigDecimal.valueOf(PRICE1));
        menu.setMenuGroupId(MENU_GROUP_ID1);
        menu.setDisplayed(true);
//        menu.setMenuProducts(menuProducts);
        return menu;
    }

    public static Menu MENU2() {
        final Menu menu = new Menu();
        menu.setId(UUID2);
        menu.setName(MENU_NAME2);
        menu.setPrice(BigDecimal.valueOf(PRICE2));
        menu.setMenuGroupId(MENU_GROUP_ID2);
        menu.setDisplayed(true);
//        menu.setMenuProducts(menuProducts);
        return menu;
    }

    public static Menu MENU_WITH_NAME(final String name) {
        final Menu menu = new Menu();
        menu.setId(UUID2);
        menu.setName(name);
        menu.setPrice(BigDecimal.valueOf(PRICE2));
        menu.setMenuGroupId(MENU_GROUP_ID2);
        menu.setDisplayed(true);
//        menu.setMenuProducts(menuProducts);
        return menu;
    }

    public static Menu MENU_WITH_PRICE(final long price) {
        final Menu menu = new Menu();
        menu.setId(UUID2);
        menu.setName(MENU_NAME1);
        menu.setPrice(BigDecimal.valueOf(price));
        menu.setMenuGroupId(MENU_GROUP_ID2);
        menu.setDisplayed(true);
//        menu.setMenuProducts(menuProducts);
        return menu;
    }

    public static Menu PRICE_NULL_MENU() {
        final Menu menu = new Menu();
        menu.setId(UUID2);
        menu.setName(MENU_NAME1);
        menu.setPrice(null);
        menu.setMenuGroupId(MENU_GROUP_ID2);
        menu.setDisplayed(true);
//        menu.setMenuProducts(menuProducts);
        return menu;
    }

    public static Menu PRICE_NEGATIVE_MENU() {
        final Menu menu = new Menu();
        menu.setId(UUID2);
        menu.setName(MENU_NAME1);
        menu.setPrice(BigDecimal.valueOf(NEGATIVE_PRICE));
        menu.setMenuGroupId(MENU_GROUP_ID2);
        menu.setDisplayed(true);
//        menu.setMenuProducts(menuProducts);
        return menu;
    }

    public static Menu EMPTY_MENUPRODUCTS_MENU() {
        final Menu menu = new Menu();
        menu.setId(UUID2);
        menu.setName(MENU_NAME1);
        menu.setPrice(BigDecimal.valueOf(NEGATIVE_PRICE));
        menu.setMenuGroupId(MENU_GROUP_ID2);
        menu.setDisplayed(true);
        menu.setMenuProducts(Collections.emptyList());
        return menu;
    }

    public static Menu QUANTITY_NAGATIVE_MENU() {
        /*
        menu.getMenuProducts()
            .get(1)
            .setQuantity(-1);
         */
        return null;
    }

    public static Menu EXPENSIVE_MENU() {
        final Menu menu = new Menu();
        menu.setId(UUID1);
        menu.setName(MENU_NAME1);
        menu.setPrice(BigDecimal.valueOf(PRICE1));
        menu.setMenuGroupId(MENU_GROUP_ID1);
        menu.setDisplayed(true);
//        menu.setMenuProducts(menuProducts);
        return menu;
    }

    public static Menu HIDED_MENU() {
        final Menu menu = new Menu();
        menu.setId(UUID1);
        menu.setName(MENU_NAME1);
        menu.setPrice(BigDecimal.valueOf(PRICE1));
        menu.setMenuGroupId(MENU_GROUP_ID1);
        menu.setDisplayed(false);
//        menu.setMenuProducts(menuProducts);
        return menu;
    }

    public static List<Menu> MENUS() {
        return Arrays.asList(MENU1(), MENU2());
    }

}