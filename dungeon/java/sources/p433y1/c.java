package p433y1;

import android.content.Context;
import java.io.File;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import kotlin.reflect.k;
import p088ef.O;
import p379v1.InterfaceC4235i;
import p397w1.b;
import p451z1.e;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Pd.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f57745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f57746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f57747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final O f57748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f57749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile InterfaceC4235i f57750f;

    static final class a extends o implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f57751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f57752b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, c cVar) {
            super(0);
            this.f57751a = context;
            this.f57752b = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context applicationContext = this.f57751a;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            return b.a(applicationContext, this.f57752b.f57745a);
        }
    }

    public c(String name, b bVar, Function1 produceMigrations, O scope) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f57745a = name;
        this.f57746b = bVar;
        this.f57747c = produceMigrations;
        this.f57748d = scope;
        this.f57749e = new Object();
    }

    @Override // Pd.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC4235i a(Context thisRef, k property) {
        InterfaceC4235i interfaceC4235i;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        InterfaceC4235i interfaceC4235i2 = this.f57750f;
        if (interfaceC4235i2 != null) {
            return interfaceC4235i2;
        }
        synchronized (this.f57749e) {
            try {
                if (this.f57750f == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    e eVar = e.f58387a;
                    b bVar = this.f57746b;
                    Function1 function1 = this.f57747c;
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                    this.f57750f = eVar.b(bVar, (List) function1.invoke(applicationContext), this.f57748d, new a(applicationContext, this));
                }
                interfaceC4235i = this.f57750f;
                Intrinsics.c(interfaceC4235i);
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4235i;
    }
}
