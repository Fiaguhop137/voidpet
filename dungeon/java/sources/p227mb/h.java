package p227mb;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.ViewGroup;
import com.facebook.react.AbstractActivityC2237q;
import com.facebook.react.C2240u;
import com.facebook.react.O;

/* JADX INFO: loaded from: classes2.dex */
public interface h {

    public interface a {
        void a(Runnable runnable);
    }

    default C2240u a(AbstractActivityC2237q abstractActivityC2237q, C2240u c2240u) {
        return null;
    }

    default ViewGroup b(Activity activity) {
        return null;
    }

    a c(AbstractActivityC2237q abstractActivityC2237q, O o10);

    default boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return false;
    }

    default boolean onKeyLongPress(int i10, KeyEvent keyEvent) {
        return false;
    }

    default boolean onKeyUp(int i10, KeyEvent keyEvent) {
        return false;
    }
}
