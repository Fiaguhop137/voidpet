package expo.modules.kotlin.views;

import Rb.z;
import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.N;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Rb.r f41085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f41086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f41087c;

    public t(Rb.r moduleHolder, r definition, String str) {
        Intrinsics.checkNotNullParameter(moduleHolder, "moduleHolder");
        Intrinsics.checkNotNullParameter(definition, "definition");
        this.f41085a = moduleHolder;
        this.f41086b = definition;
        this.f41087c = str;
    }

    public final View a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f41086b.a(context, this.f41085a.g().f());
    }

    public final Map b() {
        String[] strArrA;
        Map mapC = N.c();
        b bVarC = this.f41086b.c();
        if (bVarC != null && (strArrA = bVarC.a()) != null) {
            for (String str : strArrA) {
                mapC.put(Yb.j.a(str), N.f(Ad.v.a("registrationName", str)));
            }
        }
        return N.b(mapC);
    }

    public final Rb.r c() {
        return this.f41085a;
    }

    public final String d() {
        String str = this.f41087c;
        if (str != null) {
            return str;
        }
        return this.f41085a.h() + "_" + this.f41086b.d();
    }

    public final Map e() {
        return this.f41086b.g();
    }

    public final q f() {
        this.f41086b.i();
        return null;
    }

    public final void g(View view) {
        CodedException unexpectedException;
        CodedException codedException;
        Intrinsics.checkNotNullParameter(view, "view");
        try {
            Function1 function1E = this.f41086b.e();
            if (function1E != null) {
                function1E.invoke(view);
            }
        } catch (Throwable th) {
            if (f.a(view)) {
                return;
            }
            if (th instanceof CodedException) {
                codedException = (CodedException) th;
            } else {
                if (th instanceof p209lb.a) {
                    p209lb.a aVar = (p209lb.a) th;
                    String strA = aVar.a();
                    Intrinsics.checkNotNullExpressionValue(strA, "getCode(...)");
                    unexpectedException = new CodedException(strA, aVar.getMessage(), aVar.getCause());
                } else {
                    unexpectedException = new UnexpectedException(th);
                }
                codedException = unexpectedException;
            }
            Rb.f.a().b("❌ '" + view + "' wasn't able to destroy itself", codedException);
            this.f41086b.l(view, codedException);
        }
    }

    public final void h(View view) {
        CodedException unexpectedException;
        CodedException unexpectedException2;
        Intrinsics.checkNotNullParameter(view, "view");
        Function1 function1F = this.f41086b.f();
        if (function1F != null) {
            try {
                function1F.invoke(view);
                Unit unit = Unit.f48228a;
            } catch (Throwable th) {
                try {
                    if (th instanceof CodedException) {
                        unexpectedException2 = (CodedException) th;
                    } else if (th instanceof p209lb.a) {
                        String strA = ((p209lb.a) th).a();
                        Intrinsics.checkNotNullExpressionValue(strA, "getCode(...)");
                        unexpectedException2 = new CodedException(strA, ((p209lb.a) th).getMessage(), ((p209lb.a) th).getCause());
                    } else {
                        unexpectedException2 = new UnexpectedException(th);
                    }
                    throw new Zb.t(Ld.a.e(view.getClass()), unexpectedException2);
                } catch (Throwable th2) {
                    if (f.a(view)) {
                        return;
                    }
                    if (th2 instanceof CodedException) {
                        unexpectedException = (CodedException) th2;
                    } else if (th2 instanceof p209lb.a) {
                        p209lb.a aVar = (p209lb.a) th2;
                        String strA2 = aVar.a();
                        Intrinsics.checkNotNullExpressionValue(strA2, "getCode(...)");
                        unexpectedException = new CodedException(strA2, aVar.getMessage(), aVar.getCause());
                    } else {
                        unexpectedException = new UnexpectedException(th2);
                    }
                    Rb.f.a().b("❌ Error occurred when invoking 'onViewDidUpdateProps' on '" + view.getClass().getSimpleName() + "'", unexpectedException);
                    this.f41086b.l(view, unexpectedException);
                }
            }
        }
    }

    public final void i(Rb.r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<set-?>");
        this.f41085a = rVar;
    }

    public final List j(View view, ReadableMap propsMap) {
        CodedException unexpectedException;
        CodedException codedException;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(propsMap, "propsMap");
        Map mapE = e();
        ArrayList arrayList = new ArrayList();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = propsMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            a aVar = (a) mapE.get(strNextKey);
            if (aVar != null) {
                try {
                    Dynamic dynamic = propsMap.getDynamic(strNextKey);
                    z zVarM = this.f41085a.g().m();
                    aVar.c(dynamic, view, zVarM != null ? zVarM.b() : null);
                } catch (Throwable th) {
                    try {
                        if (!f.a(view)) {
                            if (th instanceof CodedException) {
                                codedException = (CodedException) th;
                            } else {
                                if (th instanceof p209lb.a) {
                                    String strA = ((p209lb.a) th).a();
                                    Intrinsics.checkNotNullExpressionValue(strA, "getCode(...)");
                                    unexpectedException = new CodedException(strA, ((p209lb.a) th).getMessage(), ((p209lb.a) th).getCause());
                                } else {
                                    unexpectedException = new UnexpectedException(th);
                                }
                                codedException = unexpectedException;
                            }
                            Rb.f.a().b("❌ Cannot set the '" + d() + "' prop on the '" + view + "'", codedException);
                            this.f41086b.l(view, codedException);
                        }
                    } catch (Throwable th2) {
                        arrayList.add(strNextKey);
                        throw th2;
                    }
                }
                arrayList.add(strNextKey);
            }
        }
        return arrayList;
    }
}
