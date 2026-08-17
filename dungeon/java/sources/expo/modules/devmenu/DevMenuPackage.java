package expo.modules.devmenu;

import android.app.Application;
import android.content.Context;
import com.facebook.react.P;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p227mb.b;
import p227mb.g;
import p335sb.d;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u000b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0013J#\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0013¨\u0006\u0019"}, d2 = {"Lexpo/modules/devmenu/DevMenuPackage;", "Lmb/g;", "Lcom/facebook/react/P;", "<init>", "()V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "", "Lcom/facebook/react/bridge/NativeModule;", "createNativeModules", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;", "Lcom/facebook/react/uimanager/ViewManager;", "Landroid/view/View;", "Lcom/facebook/react/uimanager/V;", "createViewManagers", "Landroid/content/Context;", "activityContext", "Lmb/i;", "b", "(Landroid/content/Context;)Ljava/util/List;", "Lmb/h;", "d", "context", "Lmb/b;", "e", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DevMenuPackage implements g, P {

    public static final class a implements b {
        a() {
        }

        @Override // p227mb.b
        public void a(Application application) {
            Intrinsics.checkNotNullParameter(application, "application");
            d.f53476a.b(application);
            p335sb.a.f53464a.b(application);
        }
    }

    @Override // p227mb.g
    public List b(Context activityContext) {
        return CollectionsKt.l();
    }

    @Override // com.facebook.react.P
    public List createNativeModules(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt.l();
    }

    @Override // com.facebook.react.P
    public List createViewManagers(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt.l();
    }

    @Override // p227mb.g
    public List d(Context activityContext) {
        return CollectionsKt.l();
    }

    @Override // p227mb.g
    public List e(Context context) {
        return CollectionsKt.e(new a());
    }
}
