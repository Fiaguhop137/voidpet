package androidx.compose.ui.platform;

import android.view.View;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return C0.c((View) obj, (View) obj2);
    }
}
