package com.example.student.express;

import java.util.ArrayList;
import java.util.List;


public class DataProvider {

    private static List<Product> list = new ArrayList<>();

    public static void initList() {
    }

    public static List<Product> getList() {
        return list;
    }

    public static void initData() {

        int[] bmw_5eries_e34Image = {R.drawable.bmw_5series_e34, R.drawable.bmw_5series_e34, R.drawable.bmw_5series_e34,
                R.drawable.bmw_5series_e34};

        Product bmw_5eries_e34 = new Product(Constant.BMW_5_SERIES_E34,
                Constant.BMW_5_SERIES_E34_DESCR,
                Constant.CATEGORY_CARS,
                3400, bmw_5eries_e34Image);
        bmw_5eries_e34.setVideoUrl("https://storage.media.ext.hp.com/homepage/elitebook800-ambient.mp4");
        bmw_5eries_e34.setAllDescription("avhienhwfiuftwogjiowerhgihgoijgotrhwiosgh,gtph,gow,togjwrosbj,wtjsgerqorfhqefhqweuifhqetgwuoefhweudfhiwefhu");
        list.add(bmw_5eries_e34);

        int[] corolla_2017Image = {R.drawable.corolla_2017, R.drawable.corolla_2017, R.drawable.corolla_2017, R.drawable.corolla_2017,
        };

        Product corolla_2017 = new Product(Constant.COROLLA_2017, Constant.COROLLA_2017_DESCR, Constant.CATEGORY_CARS,
                7000, corolla_2017Image);
        list.add(corolla_2017);

        int[] corolla_2010Image = {R.drawable.corolla_2010, R.drawable.corolla_2010, R.drawable.corolla_2010,
                R.drawable.corolla_2010,};
        Product corolla_2010 = new Product(Constant.COROLLA_2010, Constant.COROLLA_2010_DESCR, Constant.CATEGORY_CARS, 12000, corolla_2010Image);
        list.add(corolla_2010);

        int[] corolla_newImage = {R.drawable.corolla_new, R.drawable.corolla_new, R.drawable.corolla_new, R.drawable.corolla_new};
        Product corolla_new = new Product(Constant.COROLLA_NEW, Constant.COROLLA_NEW_DESCR, Constant.CATEGORY_CARS, 10000, corolla_newImage);
        list.add(corolla_new);

        int[] camry_v40Image = {R.drawable.camry_v40, R.drawable.camry_v40, R.drawable.camry_v40, R.drawable.camry_v40,
        };
        Product camry_v40 = new Product(Constant.CAMRY_V40, Constant.CAMRY_V40_DESCR, Constant.CATEGORY_CARS, 12000, camry_v40Image);
        list.add(camry_v40);


        int[] camry_v50Image = {R.drawable.camry_v50, R.drawable.camry_v50, R.drawable.camry_v50, R.drawable.camry_v50,};
        Product camry_v50 = new Product(Constant.CAMRY_V50, Constant.CAMRY_V50_DESCR, Constant.CATEGORY_CARS, 15000, camry_v40Image);
        list.add(camry_v50);

        int[] bmw_5series_e92Image = {R.drawable.bmw_5_series_e92, R.drawable.bmw_5_series_e92, R.drawable.bmw_5_series_e92, R.drawable.bmw_5_series_e92,
        };
        Product bmw_5series_e92 = new Product(Constant.BMW_5_SERIES_E92, Constant.BMW_5_SERIES_E92_DESCR, Constant.CATEGORY_CARS, 25000, bmw_5series_e92Image);
        list.add(bmw_5series_e92);

        int[] bmew_5series_e60Image = {R.drawable.bmw_5series_e60, R.drawable.bmw_5series_e60, R.drawable.bmw_5series_e60, R.drawable.bmw_5series_e60,
        };
        Product bmw_5series_e60 = new Product(Constant.BMW_5_SERIES_E60, Constant.BMW_5_SERIES_E60_DESCR, Constant.CATEGORY_CARS, 16500, bmew_5series_e60Image);
        list.add(bmw_5series_e60);

        int[] bmw_e46Image = {R.drawable.bmw_e46, R.drawable.bmw_e46, R.drawable.bmw_e46, R.drawable.bmw_e46, R.drawable.bmw_e46,
        };
        Product bmw_e46 = new Product(Constant.BMW_E46, Constant.BMW_E46_DESCR, Constant.CATEGORY_CARS, 8600, bmw_e46Image);
        list.add(bmw_e46);

        int[] bmw_5series_e39Image = {R.drawable.bmw_5series_e39, R.drawable.bmw_5series_e39, R.drawable.bmw_5series_e39, R.drawable.bmw_5series_e39};
        Product bmw_5series_e39 = new Product(Constant.BMW_5_SERIES_E39, Constant.BMW_5_SERIES_E39_DESCR, Constant.CATEGORY_CARS, 6500, bmw_5series_e39Image);
        list.add(bmw_5series_e39);


        int[] A_3Image = {R.drawable.a_3, R.drawable.a_3, R.drawable.a_3, R.drawable.a_3, R.drawable.a_3,
        };
        Product A_3 = new Product(Constant.A_3, Constant.A_3_Descr, Constant.CATEGORY_PHONES, 150, A_3Image);
        list.add(A_3);

        int[] S_6Image = {R.drawable.s6, R.drawable.s6, R.drawable.s6, R.drawable.s6, R.drawable.s6,
        };
        Product S_6 = new Product(Constant.S6, Constant.S6_DESCR, Constant.CATEGORY_PHONES, 250, S_6Image);
        list.add(S_6);

        int[] samsung_galaxy_core_2Image = {R.drawable.galaxy_core_2, R.drawable.galaxy_core_2, R.drawable.galaxy_core_2, R.drawable.galaxy_core_2,
        };
        Product samsung_galaxy_core_2 = new Product(Constant.GALAXY_CORE_2, Constant.GALAXY_CORE_2_DESCR, Constant.CATEGORY_PHONES, 130, samsung_galaxy_core_2Image);
        list.add(samsung_galaxy_core_2);

        int[] asus_1Image = {R.drawable.asus_1, R.drawable.asus_1, R.drawable.asus_1, R.drawable.asus_1,};
        Product asus_1 = new Product(Constant.ASUS_1, Constant.ASUS_1_DESCR, Constant.CATEGORY_COMPUTERS, 350, asus_1Image);
        list.add(asus_1);

        int[] mens_watchesImage = {R.drawable.mens_watches, R.drawable.mens_watches, R.drawable.mens_watches, R.drawable.mens_watches,};
        Product mens_watches = new Product(Constant.MENS_WATCHES, Constant.MENS_WATCHES_DESCR, Constant.CATEGORY_WATCHES, 35, mens_watchesImage);
        list.add(mens_watches);


    }

    public static List<Product> updatedList(final String catrgory) {
        final List<Product> listForReturn = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCategory().equals(catrgory)) {
                listForReturn.add(list.get(i));
            }
        }

        return listForReturn;
    }

    public static List<Product> returnFavourites() {

        final List<Product> listForReturn = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isFavourite()) {
                listForReturn.add(list.get(i));
            }

        }
        return listForReturn;
    }

    public static List<Product> returnStores() {

        final List<Product> listForReturn = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isStore()) {
                listForReturn.add(list.get(i));
            }

        }
        return listForReturn;
    }
}