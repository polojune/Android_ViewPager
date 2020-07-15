package com.cos.viewpagerex;

//FragmentPagerAdapter =>모든 프레그먼트를 메모리에 미리 로딩 시켜둠. 소멸 안시킨다.
//FragmentStatePagerAdapter=> default 3, 자기를 포함한 양옆만 메모리에 로딩

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class FragmentAdapter extends FragmentPagerAdapter {
    //ctrl + i 오버라이딩
    //ctrl + o
    private List<Fragment> fragmentList = new ArrayList<>();

    public FragmentAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    //FragmentList에 아이템 추가하는 함수 필요
    public void addFragment(Fragment fragment) {
        fragmentList.add(fragment);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
