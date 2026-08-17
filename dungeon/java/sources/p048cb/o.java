package p048cb;

import android.app.Application;
import android.content.Context;
import android.support.v4.media.session.b;
import com.facebook.react.InterfaceC2299z;
import com.facebook.react.O;
import com.facebook.react.V;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.devsupport.S;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.k;
import p227mb.j;
import p312r6.i;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f27397f = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC2299z a(Context context, O reactNativeHost) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(reactNativeHost, "reactNativeHost");
            return e.a(context, reactNativeHost);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Application application, O host) {
        super(application, host);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(host, "host");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object x(j jVar) {
        return jVar.i();
    }

    @Override // com.facebook.react.O
    public boolean d() {
        return p().d();
    }

    @Override // com.facebook.react.O
    public i e() {
        i iVarE = p().e();
        Intrinsics.checkNotNullExpressionValue(iVarE, "getSurfaceDelegateFactory(...)");
        return iVarE;
    }

    @Override // com.facebook.react.O
    protected S getDevSupportManagerFactory() {
        S s10 = (S) k.G(k.O(CollectionsKt.Z(s()), new n()));
        return s10 == null ? (S) v("getDevSupportManagerFactory") : s10;
    }

    @Override // com.facebook.react.defaults.d, com.facebook.react.O
    protected V.a getReactPackageTurboModuleManagerDelegateBuilder() {
        return (V.a) v("getReactPackageTurboModuleManagerDelegateBuilder");
    }

    @Override // com.facebook.react.O
    protected p456z6.i getRedBoxHandler() {
        b.a(v("getRedBoxHandler"));
        return null;
    }

    @Override // com.facebook.react.defaults.d, com.facebook.react.O
    protected UIManagerProvider getUIManagerProvider() {
        return (UIManagerProvider) v("getUIManagerProvider");
    }
}
