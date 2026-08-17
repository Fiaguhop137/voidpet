package p373ud;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p209lb.e;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f55050a = new a();

    /* JADX INFO: renamed from: ud.a$a, reason: collision with other inner class name */
    public static final class C0693a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f55051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f55052b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f55053c;

        public C0693a(String str, String str2, String str3) {
            this.f55051a = str;
            this.f55052b = str2;
            this.f55053c = str3;
        }

        public final String a() {
            return this.f55051a;
        }

        public final String b() {
            return this.f55052b;
        }

        public final String c() {
            return this.f55053c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0693a)) {
                return false;
            }
            C0693a c0693a = (C0693a) obj;
            return Intrinsics.b(this.f55051a, c0693a.f55051a) && Intrinsics.b(this.f55052b, c0693a.f55052b) && Intrinsics.b(this.f55053c, c0693a.f55053c);
        }

        public int hashCode() {
            String str = this.f55051a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f55052b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f55053c;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "AndroidResourceAsset(embeddedAssetFilename=" + this.f55051a + ", resourcesFolder=" + this.f55052b + ", resourceFilename=" + this.f55053c + ")";
        }
    }

    private a() {
    }

    private final String b(Float f10) {
        if (Intrinsics.a(f10, 0.75f)) {
            return "-ldpi";
        }
        if (Intrinsics.a(f10, 1.0f)) {
            return "-mdpi";
        }
        if (Intrinsics.a(f10, 1.5f)) {
            return "-hdpi";
        }
        if (Intrinsics.a(f10, 2.0f)) {
            return "-xhdpi";
        }
        if (Intrinsics.a(f10, 3.0f)) {
            return "-xxhdpi";
        }
        return Intrinsics.a(f10, 4.0f) ? "-xxxhdpi" : "";
    }

    public final String a(p158id.a asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        String strE = asset.e();
        if (asset.b() != null) {
            return "file:///android_asset/" + asset.b() + strE;
        }
        if (asset.o() == null || asset.n() == null) {
            return null;
        }
        return "file:///android_res/" + asset.o() + b(asset.p()) + "/" + asset.n() + strE;
    }

    public final boolean c(Context context, String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            context.getAssets().open(name).close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public final boolean d(Context context, String filePath) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        C0693a c0693aG = g(filePath);
        String strA = c0693aG.a();
        String strB = c0693aG.b();
        String strC = c0693aG.c();
        if (strA != null) {
            return c(context, strA);
        }
        if (strB == null || strC == null) {
            return false;
        }
        return f(context, strB, strC);
    }

    public final boolean e(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return StringsKt.O(filePath, "file:///android_res/", false, 2, null) || StringsKt.O(filePath, "file:///android_asset/", false, 2, null);
    }

    public final boolean f(Context context, String resourceFolder, String resourceFilename) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(resourceFolder, "resourceFolder");
        Intrinsics.checkNotNullParameter(resourceFilename, "resourceFilename");
        return context.getResources().getIdentifier(resourceFilename, resourceFolder, context.getPackageName()) != 0;
    }

    public final C0693a g(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        if (!StringsKt.O(filePath, "file:///android_res/", false, 2, null)) {
            return StringsKt.O(filePath, "file:///android_asset/", false, 2, null) ? new C0693a(StringsKt.V0(filePath, '/', null, 2, null), null, null) : new C0693a(null, null, null);
        }
        List<String> pathSegments = Uri.parse(filePath).getPathSegments();
        if (pathSegments.size() < 3) {
            throw new e("Invalid resource file path: " + filePath);
        }
        String str = pathSegments.get(1);
        Intrinsics.checkNotNullExpressionValue(str, "get(...)");
        String strZ0 = StringsKt.Z0(str, '-', null, 2, null);
        String str2 = pathSegments.get(2);
        Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
        String str3 = pathSegments.get(2);
        Intrinsics.checkNotNullExpressionValue(str3, "get(...)");
        return new C0693a(null, strZ0, StringsKt.b1(str2, '.', str3));
    }
}
