package Xa;

import android.app.Activity;
import dev.hyo.openiap.listener.OpenIapPurchaseErrorListener;
import dev.hyo.openiap.listener.OpenIapPurchaseUpdateListener;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public interface K {
    void a(OpenIapPurchaseErrorListener openIapPurchaseErrorListener);

    Function2 b();

    void c(OpenIapPurchaseErrorListener openIapPurchaseErrorListener);

    Object d(EnumC1634e enumC1634e, Ed.b bVar);

    Function2 e();

    void f(OpenIapPurchaseUpdateListener openIapPurchaseUpdateListener);

    Function2 g();

    Object h(EnumC1634e enumC1634e, Ed.b bVar);

    void i(OpenIapPurchaseUpdateListener openIapPurchaseUpdateListener);

    C j();

    Function1 l();

    Object m(Activity activity, A a10, Ed.b bVar);
}
