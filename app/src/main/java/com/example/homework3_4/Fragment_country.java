package  com.example.homework3_4;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.homework3_4.databinding.Country_Binding;

import java.util.ArrayList;


public class Fragment_country extends Fragment {
    private Country_Binding  binding;
    private ArrayList<Country> countryArrayList;
    private int position;
    private CountryAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = Country_Binding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        position = getArguments().getInt("key");
        checkPosition(position);
        adapter = new CountryAdapter(countryArrayList);
        binding.rvCountry.setAdapter(adapter);


    }
    private void checkPosition(int position) {
        if (position == 0){
            loadEurasia();
        } else if (position == 1) {
            loadAfrica();
        } else if (position == 2) {
            loadAustralia();
        } else if (position == 3) {
            loadNorthAmerica();
        } else if (position == 4) {
            loadSouthAmerica();
        }
    }
    private void loadSouthAmerica() {
        countryArrayList = new ArrayList<>();
        countryArrayList.add(new Country("Бразилия", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Flag_of_Brazil.svg/2560px-Flag_of_Brazil.svg.png"));
        countryArrayList.add(new Country("Аргентина", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Flag_of_Argentina.svg/1280px-Flag_of_Argentina.svg.png"));
        countryArrayList.add(new Country("Перу", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/df/Flag_of_Peru_%28state%29.svg/2560px-Flag_of_Peru_%28state%29.svg.png"));
        countryArrayList.add(new Country("Венесуэла", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/Flag_of_Venezuela.svg/2560px-Flag_of_Venezuela.svg.png"));
        countryArrayList.add(new Country("Уругвай", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Flag_of_Uruguay.svg/2560px-Flag_of_Uruguay.svg.png"));
    }

    private void loadNorthAmerica() {
        countryArrayList = new ArrayList<>();
        countryArrayList.add(new Country("США", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Flag_of_the_United_States.png/1200px-Flag_of_the_United_States.png"));
        countryArrayList.add(new Country("Канада", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Flag_of_Canada.svg/1024px-Flag_of_Canada.svg.png"));
        countryArrayList.add(new Country("Куба", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bd/Flag_of_Cuba.svg/1024px-Flag_of_Cuba.svg.png"));
        countryArrayList.add(new Country("Мексика", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Flag_of_Mexico.svg/2560px-Flag_of_Mexico.svg.png"));
        countryArrayList.add(new Country("Коста-Рика", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/Flag_of_Costa_Rica.svg/1280px-Flag_of_Costa_Rica.svg.png"));
    }
    private void loadEurasia() {
        countryArrayList = new ArrayList<>();
        countryArrayList.add(new Country("Кыргызстан", "https://grs.gov.kg/uploads/state_symbols/flag_standart.png"));
        countryArrayList.add(new Country("Россия", "https://upload.wikimedia.org/wikipedia/commons/d/d4/Flag_of_Russia.png"));
        countryArrayList.add(new Country("Турция", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b4/Flag_of_Turkey.svg/320px-Flag_of_Turkey.svg.png"));
        countryArrayList.add(new Country("Германия", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Flag_of_Germany.svg/1280px-Flag_of_Germany.svg.png"));
        countryArrayList.add(new Country("Украина", "https://upload.wikimedia.org/wikipedia/commons/d/d2/Flag_of_Ukraine.png"));
    }



    private void loadAfrica() {
        countryArrayList = new ArrayList<>();
        countryArrayList.add(new Country("Нигерия", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/79/Flag_of_Nigeria.svg/1280px-Flag_of_Nigeria.svg.png"));
        countryArrayList.add(new Country("Гана", "https://www.flagistrany.ru/data/flags/w580/gh.png"));
        countryArrayList.add(new Country("Судан", "https://upload.wikimedia.org/wikipedia/commons/1/1a/Flag_of_Sudan.png"));
        countryArrayList.add(new Country("Габон", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9d/Flag_of_Angola.svg/250px-Flag_of_Angola.svg.png"));
        countryArrayList.add(new Country("Ангола", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9d/Flag_of_Angola.svg/250px-Flag_of_Angola.svg.png"));
    }
    private void loadAustralia() {
        countryArrayList = new ArrayList<>();
        countryArrayList.add(new Country("Новая Зеландия", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/34/Flag_of_New_Zealand.png/1200px-Flag_of_New_Zealand.png"));
        countryArrayList.add(new Country("Тувалу", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/38/Flag_of_Tuvalu.svg/1024px-Flag_of_Tuvalu.svg.png"));
        countryArrayList.add(new Country("Тонга", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Flag_of_Tonga.svg/1280px-Flag_of_Tonga.svg.png"));
        countryArrayList.add(new Country("Самоа", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/87/Flag_of_American_Samoa.svg/1024px-Flag_of_American_Samoa.svg.png"));
        countryArrayList.add(new Country("Карибати", "https://cdn.pixabay.com/photo/2012/04/12/23/52/kiribati-31016_1280.png"));
    }



}