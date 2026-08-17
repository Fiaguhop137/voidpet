package p048cb;

import android.app.Application;
import com.facebook.react.A;
import com.facebook.react.I;
import com.facebook.react.O;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.defaults.d;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.k;
import p227mb.g;
import p227mb.j;
import p323s.C4101a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O f27400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f27401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C4101a f27402e;

    public static final class a implements A {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f27404b;

        a(boolean z10) {
            this.f27404b = z10;
        }

        @Override // com.facebook.react.A
        public void a(ReactContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            List listS = t.this.s();
            boolean z10 = this.f27404b;
            Iterator it = listS.iterator();
            while (it.hasNext()) {
                ((j) it.next()).f(z10, context);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Application application, O host) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(host, "host");
        this.f27400c = host;
        List listA = c.f27311b.a();
        ArrayList arrayList = new ArrayList();
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            List listA2 = ((g) it.next()).a(application);
            Intrinsics.checkNotNullExpressionValue(listA2, "createReactNativeHostHandlers(...)");
            CollectionsKt.B(arrayList, listA2);
        }
        this.f27401d = arrayList;
        this.f27402e = new C4101a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String o(t tVar, j jVar) {
        return jVar.a(tVar.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String q(t tVar, j jVar) {
        return jVar.b(tVar.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JavaScriptExecutorFactory r(j jVar) {
        return jVar.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean t(j jVar) {
        return jVar.g();
    }

    private final void u(I i10) throws IllegalAccessException, NoSuchFieldException {
        Field declaredField = O.class.getDeclaredField("b");
        declaredField.setAccessible(true);
        declaredField.set(this.f27400c, i10);
    }

    @Override // com.facebook.react.O
    protected I createReactInstanceManager() throws IllegalAccessException, NoSuchFieldException {
        boolean zF = f();
        Iterator it = this.f27401d.iterator();
        while (it.hasNext()) {
            ((j) it.next()).h(zF);
        }
        I iCreateReactInstanceManager = super.createReactInstanceManager();
        Intrinsics.checkNotNullExpressionValue(iCreateReactInstanceManager, "createReactInstanceManager(...)");
        Iterator it2 = this.f27401d.iterator();
        while (it2.hasNext()) {
            ((j) it2.next()).c(iCreateReactInstanceManager.E());
        }
        iCreateReactInstanceManager.s(new a(zF));
        u(iCreateReactInstanceManager);
        return iCreateReactInstanceManager;
    }

    @Override // com.facebook.react.O
    public boolean f() {
        Boolean bool = (Boolean) k.G(k.O(CollectionsKt.Z(this.f27401d), new p()));
        return bool != null ? bool.booleanValue() : this.f27400c.f();
    }

    @Override // com.facebook.react.O
    public String getBundleAssetName() {
        String str = (String) k.G(k.O(CollectionsKt.Z(this.f27401d), new s(this)));
        return str == null ? (String) v("getBundleAssetName") : str;
    }

    @Override // com.facebook.react.O
    public String getJSBundleFile() {
        String str = (String) k.G(k.O(CollectionsKt.Z(this.f27401d), new q(this)));
        return str == null ? (String) v("getJSBundleFile") : str;
    }

    @Override // com.facebook.react.O
    public String getJSMainModuleName() {
        return (String) v("getJSMainModuleName");
    }

    @Override // com.facebook.react.O
    protected JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
        JavaScriptExecutorFactory javaScriptExecutorFactory = (JavaScriptExecutorFactory) k.G(k.O(CollectionsKt.Z(this.f27401d), new r()));
        return javaScriptExecutorFactory == null ? (JavaScriptExecutorFactory) v("getJavaScriptExecutorFactory") : javaScriptExecutorFactory;
    }

    @Override // com.facebook.react.O
    public List getPackages() {
        return (List) v("getPackages");
    }

    protected final O p() {
        return this.f27400c;
    }

    public final List s() {
        return this.f27401d;
    }

    public final Object v(String name) throws NoSuchMethodException {
        Intrinsics.checkNotNullParameter(name, "name");
        Method declaredMethod = (Method) this.f27402e.get(name);
        if (declaredMethod == null) {
            declaredMethod = O.class.getDeclaredMethod(name, null);
            declaredMethod.setAccessible(true);
            this.f27402e.put(name, declaredMethod);
        }
        Intrinsics.c(declaredMethod);
        return declaredMethod.invoke(this.f27400c, null);
    }
}
