package p146i1;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import p002a1.h;
import p020b1.u;
import p323s.C4125z;

/* JADX INFO: loaded from: classes.dex */
abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C4125z f43513a = new C4125z(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Comparator f43514b = new d();

    private interface a {
        static a a(Context context, Uri uri) {
            return new b(context, uri);
        }

        Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    private static class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentProviderClient f43515a;

        b(Context context, Uri uri) {
            this.f43515a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // i1.e.a
        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f43515a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e10) {
                Log.w("FontsProvider", "Unable to query the content provider", e10);
                return null;
            }
        }

        @Override // i1.e.a
        public void close() {
            ContentProviderClient contentProviderClient = this.f43515a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f43516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f43517b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        List f43518c;

        c(String str, String str2, List list) {
            this.f43516a = str;
            this.f43517b = str2;
            this.f43518c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Objects.equals(this.f43516a, cVar.f43516a) && Objects.equals(this.f43517b, cVar.f43517b) && Objects.equals(this.f43518c, cVar.f43518c);
        }

        public int hashCode() {
            return Objects.hash(this.f43516a, this.f43517b, this.f43518c);
        }
    }

    public static /* synthetic */ int a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            byte b11 = bArr2[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
        }
        return 0;
    }

    private static List b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private static List d(f fVar, Resources resources) {
        return fVar.b() != null ? fVar.b() : h.c(resources, fVar.c());
    }

    static j.a e(Context context, List list, CancellationSignal cancellationSignal) {
        String strH;
        Typeface typefaceH;
        p381v3.a.c("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                f fVar = (f) list.get(i10);
                if (Build.VERSION.SDK_INT < 31 || (typefaceH = u.h((strH = fVar.h()))) == null || u.j(typefaceH) == null) {
                    ProviderInfo providerInfoF = f(context.getPackageManager(), fVar, context.getResources());
                    if (providerInfoF == null) {
                        return j.a.b(1, null);
                    }
                    arrayList.add(g(context, fVar, providerInfoF.authority, cancellationSignal));
                } else {
                    arrayList.add(new j.b[]{new j.b(strH, fVar.i())});
                }
            }
            return j.a.a(0, arrayList);
        } finally {
            p381v3.a.f();
        }
    }

    static ProviderInfo f(PackageManager packageManager, f fVar, Resources resources) {
        p381v3.a.c("FontProvider.getProvider");
        try {
            List listD = d(fVar, resources);
            c cVar = new c(fVar.e(), fVar.f(), listD);
            ProviderInfo providerInfo = (ProviderInfo) f43513a.c(cVar);
            if (providerInfo != null) {
                p381v3.a.f();
                return providerInfo;
            }
            String strE = fVar.e();
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strE, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + strE);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(fVar.f())) {
                throw new PackageManager.NameNotFoundException("Found content provider " + strE + ", but package was not " + fVar.f());
            }
            List listB = b(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
            Collections.sort(listB, f43514b);
            for (int i10 = 0; i10 < listD.size(); i10++) {
                ArrayList arrayList = new ArrayList((Collection) listD.get(i10));
                Collections.sort(arrayList, f43514b);
                if (c(listB, arrayList)) {
                    f43513a.d(cVar, providerInfoResolveContentProvider);
                    p381v3.a.f();
                    return providerInfoResolveContentProvider;
                }
            }
            p381v3.a.f();
            return null;
        } catch (Throwable th) {
            p381v3.a.f();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00e1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [i1.e$a] */
    /* JADX WARN: Type inference failed for: r16v7 */
    static j.b[] g(Context context, f fVar, String str, CancellationSignal cancellationSignal) {
        ?? r16;
        a aVar;
        boolean z10;
        p381v3.a.c("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            a aVarA = a.a(context, uriBuild);
            Cursor cursorB = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                p381v3.a.c("ContentQueryWrapper.query");
                try {
                    try {
                        cursorB = aVarA.b(uriBuild, strArr, "query = ?", new String[]{fVar.g()}, null, cancellationSignal);
                        p381v3.a.f();
                        if (cursorB == null || cursorB.getCount() <= 0) {
                            aVar = aVarA;
                        } else {
                            int columnIndex = cursorB.getColumnIndex("result_code");
                            ArrayList arrayList2 = new ArrayList();
                            int columnIndex2 = cursorB.getColumnIndex("_id");
                            int columnIndex3 = cursorB.getColumnIndex("file_id");
                            int columnIndex4 = cursorB.getColumnIndex("font_ttc_index");
                            int columnIndex5 = cursorB.getColumnIndex("font_weight");
                            int columnIndex6 = cursorB.getColumnIndex("font_italic");
                            while (cursorB.moveToNext()) {
                                int i10 = columnIndex != -1 ? cursorB.getInt(columnIndex) : 0;
                                int i11 = columnIndex4 != -1 ? cursorB.getInt(columnIndex4) : 0;
                                Uri uriWithAppendedId = columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorB.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorB.getLong(columnIndex3));
                                int i12 = columnIndex5 != -1 ? cursorB.getInt(columnIndex5) : 400;
                                if (columnIndex6 != -1) {
                                    z10 = true;
                                    if (cursorB.getInt(columnIndex6) != 1) {
                                        z10 = false;
                                    }
                                } else {
                                    z10 = false;
                                }
                                arrayList2.add(j.b.a(uriWithAppendedId, i11, i12, z10, i10));
                                aVarA = aVarA;
                            }
                            aVar = aVarA;
                            arrayList = arrayList2;
                        }
                        if (cursorB != null) {
                            cursorB.close();
                        }
                        aVar.close();
                        return (j.b[]) arrayList.toArray(new j.b[0]);
                    } finally {
                        p381v3.a.f();
                    }
                } catch (Throwable th) {
                    th = th;
                    r16 = context;
                    if (cursorB != null) {
                        cursorB.close();
                    }
                    r16.close();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                r16 = aVarA;
            }
        } catch (Throwable th3) {
            p381v3.a.f();
            throw th3;
        }
    }
}
