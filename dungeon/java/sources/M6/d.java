package M6;

import com.facebook.react.modules.core.JavaTimerManager;
import java.util.Comparator;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2 f6809a;

    public /* synthetic */ d(Function2 function2) {
        this.f6809a = function2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return JavaTimerManager.C(this.f6809a, obj, obj2);
    }
}
