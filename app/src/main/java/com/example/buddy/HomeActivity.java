package com.example.buddy;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.buddy.Adapter.ViewPagerAdapter;
import com.example.buddy.Fragments.CommunityFragment;
import com.example.buddy.Fragments.DiscoverFragment;
import com.example.buddy.Fragments.LibraryFragment;
import com.example.buddy.Fragments.MapsFragment;
import com.example.buddy.Fragments.ProfileFragment;

public class HomeActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    ViewPager viewPager;
    BottomNavigationView bottomNavigationView;
    MenuItem prevMenuItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);




        viewPager=findViewById(R.id.viewPager);
        bottomNavigationView=findViewById(R.id.bottomView);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);


        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                if(prevMenuItem!=null){

                    prevMenuItem.setChecked(false);
                }else{

                    bottomNavigationView.getMenu().getItem(0).setChecked(false);
                }

                bottomNavigationView.getMenu().getItem(i).setChecked(false);
                prevMenuItem=bottomNavigationView.getMenu().getItem(i);

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });


        setUpViewPager(viewPager);

    }

    private void setUpViewPager(ViewPager viewPager) {

        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());

        CommunityFragment communityFragment=new CommunityFragment();
        DiscoverFragment discoverFragment=new DiscoverFragment();
        LibraryFragment libraryFragment=new LibraryFragment();
        MapsFragment mapsFragment=new MapsFragment();
        ProfileFragment profileFragment=new ProfileFragment();
        viewPagerAdapter.addFragment(libraryFragment);
        viewPagerAdapter.addFragment(discoverFragment);
        viewPagerAdapter.addFragment(communityFragment);
        viewPagerAdapter.addFragment(profileFragment);
        viewPagerAdapter.addFragment(mapsFragment);
        viewPager.setAdapter(viewPagerAdapter);




    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()){

            case R.id.library:
                viewPager.setCurrentItem(0);
                break;

            case  R.id.discover:
                viewPager.setCurrentItem(1);
                break;
            case R.id.cummunity:
                viewPager.setCurrentItem(2);
                break;
            case R.id.profile:
                viewPager.setCurrentItem(3);
                break;
            case R.id.maps:
                viewPager.setCurrentItem(4);
                break;

        }

        return false;
    }





}
