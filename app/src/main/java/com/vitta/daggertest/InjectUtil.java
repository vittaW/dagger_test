package com.vitta.daggertest;

import android.app.Activity;

/**
 * 作者：王文婷 邮箱：WVitta@126.com
 * 创建时间：2017/12/14 18:23
 * 描述：InjectUtil
 *
 注解和反射通常一起使用。使用对象的Class 对象，获取类上的注解，方法等。。。

 获取Class 对象的三种方法
    ①类名.class
    ②对象.getClass()
    ③Class.forName("全路径")

 */

public class InjectUtil {

    /**
     * 完成布局和view 的注入
     * @param activity
     */
    public static void inject(Activity activity){
        injectLayout(activity);
    }

    private static void injectLayout(Activity activity){
        //setContentView(R.layout.activity_main)
        Class<? extends Activity> aClass = activity.getClass();
        ContentView annotation = aClass.getAnnotation(ContentView.class);
        //判断注解是否存在
        if (annotation != null){
            //注解就直接. 调用值
            int value = annotation.value();//layout
            activity.setContentView(value);
//            aClass.getDeclaredMethod()
        }
    }
}
