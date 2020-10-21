package com.example.ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AdminCategoryActivity extends AppCompatActivity
{
    private ImageView tShirts, sportTShirts, femaleDresses, sweathers;
    private ImageView glasses, hatsCaps, walletBagsPurses, shoes;
    private ImageView headPhonesHandfree, laptops, watches, mobilePhones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        tShirts = (ImageView) findViewById(R.id.t_shirts);
        sportTShirts = (ImageView) findViewById(R.id.sports_t_shirts);
        femaleDresses = (ImageView) findViewById(R.id.female_dresses);
        sweathers = (ImageView) findViewById(R.id.sweathers);

        glasses = (ImageView) findViewById(R.id.glasses);
        hatsCaps = (ImageView) findViewById(R.id.hats_caps);
        walletBagsPurses = (ImageView) findViewById(R.id.purses_bags_wallets);
        shoes = (ImageView) findViewById(R.id.shoes);

        headPhonesHandfree = (ImageView) findViewById(R.id.headphone_handfree);
        laptops = (ImageView) findViewById(R.id.laptops_pc);
        watches = (ImageView) findViewById(R.id.watches);
        mobilePhones = (ImageView) findViewById(R.id.mobilephones);

        tShirts.setOnClickListener(v ->
        {
            Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
            intent.putExtra("category","TShirts");
            startActivity(intent);
        });

        sportTShirts.setOnClickListener(v ->
        {
            Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
            intent.putExtra("category","Sports TShirts");
            startActivity(intent);
        });

        femaleDresses.setOnClickListener(v ->
        {
            Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
            intent.putExtra("category","Female Dresses");
            startActivity(intent);
        });

        sweathers.setOnClickListener(v ->
        {
            Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
            intent.putExtra("category","Sweathers");
            startActivity(intent);
        });

        glasses.setOnClickListener(v ->
        {
            Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
            intent.putExtra("category","Glasses");
            startActivity(intent);
        });

        hatsCaps.setOnClickListener(v ->
        {
            Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
            intent.putExtra("category","Hats Caps");
            startActivity(intent);
        });

        walletBagsPurses.setOnClickListener(v ->
        {
            Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
            intent.putExtra("category","Wallets Bags Purses");
            startActivity(intent);
        });

        shoes.setOnClickListener(v ->
        {
            Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
            intent.putExtra("category","Shoes");
            startActivity(intent);
        });

        headPhonesHandfree.setOnClickListener(v ->
        {
            Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
            intent.putExtra("category","Headphones Handfree");
            startActivity(intent);
        });

        laptops.setOnClickListener(v ->
        {
            Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
            intent.putExtra("category","Laptops");
            startActivity(intent);
        });

        watches.setOnClickListener(v ->
        {
            Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
            intent.putExtra("category","Watches");
            startActivity(intent);
        });

        mobilePhones.setOnClickListener(v ->
        {
            Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
            intent.putExtra("category","Mobile Phones");
            startActivity(intent);
        });
    }
}
