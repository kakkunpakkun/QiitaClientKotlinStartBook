package sample.qiitaclient

import android.support.annotation.IdRes
import android.view.View

/**
 * Created by kakkunpakkun on 2016/07/17.
 */
fun <T: View> View.bindView(@IdRes id: Int): Lazy<T> = lazy {
    findViewById(id) as T
}