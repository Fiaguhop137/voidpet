package p366u6;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build;
import android.util.SparseArray;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f55012c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f55013d = {"", "_bold", "_italic", "_bold_italic"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f55014e = {".ttf", ".otf"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f55015f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f55016a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f55017b = new LinkedHashMap();

    /* JADX INFO: renamed from: u6.a$a, reason: collision with other inner class name */
    private static final class C0690a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseArray f55018a = new SparseArray(4);

        public final Typeface a(int i10) {
            return (Typeface) this.f55018a.get(i10);
        }

        public final void b(int i10, Typeface typeface) {
            this.f55018a.put(i10, typeface);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Typeface b(String str, int i10, AssetManager assetManager) {
            if (assetManager != null) {
                String str2 = a.f55013d[i10];
                for (String str3 : a.f55014e) {
                    try {
                        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(assetManager, "fonts/" + str + str2 + str3);
                        Intrinsics.checkNotNullExpressionValue(typefaceCreateFromAsset, "createFromAsset(...)");
                        return typefaceCreateFromAsset;
                    } catch (RuntimeException unused) {
                    }
                }
            }
            Typeface typefaceCreate = Typeface.create(str, i10);
            Intrinsics.checkNotNullExpressionValue(typefaceCreate, "create(...)");
            return typefaceCreate;
        }

        public final a c() {
            return a.f55015f;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0691a f55019c = new C0691a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f55020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f55021b;

        /* JADX INFO: renamed from: u6.a$c$a, reason: collision with other inner class name */
        public static final class C0691a {
            private C0691a() {
            }

            public /* synthetic */ C0691a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public c(int i10, int i11) {
            i10 = i10 == -1 ? 0 : i10;
            this.f55020a = (i10 & 2) != 0;
            this.f55021b = i11 == -1 ? (i10 & 1) != 0 ? 700 : 400 : i11;
        }

        public /* synthetic */ c(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i12 & 2) != 0 ? -1 : i11);
        }

        public c(int i10, boolean z10) {
            this.f55020a = z10;
            this.f55021b = i10 == -1 ? 400 : i10;
        }

        public final Typeface a(Typeface typeface) {
            if (Build.VERSION.SDK_INT < 28) {
                Typeface typefaceCreate = Typeface.create(typeface, b());
                Intrinsics.c(typefaceCreate);
                return typefaceCreate;
            }
            Typeface typefaceCreate2 = Typeface.create(typeface, this.f55021b, this.f55020a);
            Intrinsics.c(typefaceCreate2);
            return typefaceCreate2;
        }

        public final int b() {
            if (this.f55021b < 700) {
                return this.f55020a ? 2 : 0;
            }
            return this.f55020a ? 3 : 1;
        }
    }

    public final Typeface d(String fontFamilyName, int i10, int i11, AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(fontFamilyName, "fontFamilyName");
        return g(fontFamilyName, new c(i10, i11), assetManager);
    }

    public final Typeface e(String fontFamilyName, int i10, AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(fontFamilyName, "fontFamilyName");
        return g(fontFamilyName, new c(i10, 0, 2, null), assetManager);
    }

    public final Typeface f(String fontFamilyName, int i10, boolean z10, AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(fontFamilyName, "fontFamilyName");
        return g(fontFamilyName, new c(i10, z10), assetManager);
    }

    public final Typeface g(String fontFamilyName, c typefaceStyle, AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(fontFamilyName, "fontFamilyName");
        Intrinsics.checkNotNullParameter(typefaceStyle, "typefaceStyle");
        if (this.f55017b.containsKey(fontFamilyName)) {
            return typefaceStyle.a((Typeface) this.f55017b.get(fontFamilyName));
        }
        Map map = this.f55016a;
        Object c0690a = map.get(fontFamilyName);
        if (c0690a == null) {
            c0690a = new C0690a();
            map.put(fontFamilyName, c0690a);
        }
        C0690a c0690a2 = (C0690a) c0690a;
        int iB = typefaceStyle.b();
        Typeface typefaceA = c0690a2.a(iB);
        if (typefaceA != null) {
            return typefaceA;
        }
        Typeface typefaceB = f55012c.b(fontFamilyName, iB, assetManager);
        c0690a2.b(iB, typefaceB);
        return typefaceB;
    }

    public final void h(String fontFamilyName, int i10, Typeface typeface) {
        Intrinsics.checkNotNullParameter(fontFamilyName, "fontFamilyName");
        if (typeface != null) {
            Map map = this.f55016a;
            Object c0690a = map.get(fontFamilyName);
            if (c0690a == null) {
                c0690a = new C0690a();
                map.put(fontFamilyName, c0690a);
            }
            ((C0690a) c0690a).b(i10, typeface);
        }
    }
}
