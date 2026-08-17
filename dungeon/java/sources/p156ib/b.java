package p156ib;

import Ad.v;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.collections.N;
import kotlin.enums.EnumEntries;
import kotlin.io.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p227mb.d;

/* JADX INFO: loaded from: classes2.dex */
public class b implements d, Mb.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f43846d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f43847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f43849c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(float f10, Context context) {
            return (int) (f10 / (context.getResources().getDisplayMetrics().densityDpi / 160.0f));
        }
    }

    /* JADX INFO: renamed from: ib.b$b, reason: collision with other inner class name */
    public enum EnumC0519b {
        BARE("bare"),
        STANDALONE("standalone"),
        STORE_CLIENT("storeClient");


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f43854f = Gd.a.a(e());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f43855a;

        EnumC0519b(String str) {
            this.f43855a = str;
        }

        public final String g() {
            return this.f43855a;
        }
    }

    public b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43847a = context;
        Integer numValueOf = Integer.valueOf(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
        numValueOf = numValueOf.intValue() <= 0 ? null : numValueOf;
        this.f43848b = numValueOf != null ? f43846d.b(context.getResources().getDimensionPixelSize(numValueOf.intValue()), context) : 0;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.f43849c = string;
    }

    private final String a() {
        try {
            InputStream inputStreamOpen = this.f43847a.getAssets().open("app.config");
            try {
                String strJ = Nf.d.j(inputStreamOpen, StandardCharsets.UTF_8);
                c.a(inputStreamOpen, null);
                return strJ;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    c.a(inputStreamOpen, th);
                    throw th2;
                }
            }
        } catch (FileNotFoundException unused) {
            return null;
        } catch (Exception e10) {
            Log.e(c.f43856a, "Error reading embedded app config", e10);
            return null;
        }
    }

    public String b() {
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        return MODEL;
    }

    public List c() {
        return CollectionsKt.o("normal", "notoserif", "sans-serif", "sans-serif-light", "sans-serif-thin", "sans-serif-condensed", "sans-serif-medium", "serif", "Roboto", "monospace");
    }

    public String e() {
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        return RELEASE;
    }

    @Override // Mb.a
    public Map getConstants() {
        return N.m(v.a("sessionId", this.f43849c), v.a("executionEnvironment", EnumC0519b.BARE.g()), v.a("statusBarHeight", Integer.valueOf(this.f43848b)), v.a("deviceName", b()), v.a("systemFonts", c()), v.a("systemVersion", e()), v.a("manifest", a()), v.a("platform", N.f(v.a("android", N.i()))));
    }

    @Override // p227mb.d
    public List h() {
        return CollectionsKt.e(Mb.a.class);
    }
}
