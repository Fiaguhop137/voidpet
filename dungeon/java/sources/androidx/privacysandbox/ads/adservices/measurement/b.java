package androidx.privacysandbox.ads.adservices.measurement;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f24820a = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.measurement.b$a$a, reason: collision with other inner class name */
        static final class C0309a extends kotlin.jvm.internal.o implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f24821a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0309a(Context context) {
                super(1);
                this.f24821a = context;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d invoke(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new d(this.f24821a);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AdServicesInfo.version=");
            p094f3.b bVar = p094f3.b.f41708a;
            sb2.append(bVar.a());
            Log.d("MeasurementManager", sb2.toString());
            if (bVar.a() >= 5) {
                return new g(context);
            }
            if (bVar.b() >= 9) {
                return (b) p094f3.c.f41711a.a(context, "MeasurementManager", new C0309a(context));
            }
            return null;
        }
    }

    public abstract Object a(androidx.privacysandbox.ads.adservices.measurement.a aVar, Ed.b bVar);

    public abstract Object b(Ed.b bVar);

    public abstract Object c(Uri uri, InputEvent inputEvent, Ed.b bVar);

    public abstract Object d(m mVar, Ed.b bVar);

    public abstract Object e(Uri uri, Ed.b bVar);

    public abstract Object f(n nVar, Ed.b bVar);

    public abstract Object g(o oVar, Ed.b bVar);
}
