package Y0;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f16781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharSequence[] f16782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f16783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f16784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Bundle f16785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f16786g;

    static class a {
        static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(u uVar) {
            Set setF;
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(uVar.n()).setLabel(uVar.m()).setChoices(uVar.g()).setAllowFreeFormInput(uVar.e()).addExtras(uVar.l());
            if (Build.VERSION.SDK_INT >= 26 && (setF = uVar.f()) != null) {
                Iterator it = setF.iterator();
                while (it.hasNext()) {
                    b.c(builderAddExtras, (String) it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                d.a(builderAddExtras, uVar.j());
            }
            return builderAddExtras.build();
        }

        static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    static class b {
        static void a(u uVar, Intent intent, Map map) {
            RemoteInput.addDataResultToIntent(u.c(uVar), intent, map);
        }

        static Map b(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        static RemoteInput.Builder c(RemoteInput.Builder builder, String str, boolean z10) {
            return builder.setAllowDataType(str, z10);
        }
    }

    static class c {
        static int a(Intent intent) {
            return RemoteInput.getResultsSource(intent);
        }

        static void b(Intent intent, int i10) {
            RemoteInput.setResultsSource(intent, i10);
        }
    }

    static class d {
        static RemoteInput.Builder a(RemoteInput.Builder builder, int i10) {
            return builder.setEditChoicesBeforeSending(i10);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f16787a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CharSequence f16790d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CharSequence[] f16791e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f16788b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Bundle f16789c = new Bundle();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f16792f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f16793g = 0;

        public e(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f16787a = str;
        }

        public u a() {
            return new u(this.f16787a, this.f16790d, this.f16791e, this.f16792f, this.f16793g, this.f16789c, this.f16788b);
        }

        public e b(CharSequence charSequence) {
            this.f16790d = charSequence;
            return this;
        }
    }

    u(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z10, int i10, Bundle bundle, Set set) {
        this.f16780a = str;
        this.f16781b = charSequence;
        this.f16782c = charSequenceArr;
        this.f16783d = z10;
        this.f16784e = i10;
        this.f16785f = bundle;
        this.f16786g = set;
        if (j() == 2 && !e()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static void a(u uVar, Intent intent, Map map) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.a(uVar, intent, map);
            return;
        }
        Intent intentH = h(intent);
        if (intentH == null) {
            intentH = new Intent();
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Uri uri = (Uri) entry.getValue();
            if (str != null) {
                Bundle bundleExtra = intentH.getBundleExtra(k(str));
                if (bundleExtra == null) {
                    bundleExtra = new Bundle();
                }
                bundleExtra.putString(uVar.n(), uri.toString());
                intentH.putExtra(k(str), bundleExtra);
            }
        }
        intent.setClipData(ClipData.newIntent("android.remoteinput.results", intentH));
    }

    public static void b(u[] uVarArr, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(d(uVarArr), intent, bundle);
            return;
        }
        Bundle bundleO = o(intent);
        int iP = p(intent);
        if (bundleO != null) {
            bundleO.putAll(bundle);
            bundle = bundleO;
        }
        for (u uVar : uVarArr) {
            Map mapI = i(intent, uVar.n());
            a.a(d(new u[]{uVar}), intent, bundle);
            if (mapI != null) {
                a(uVar, intent, mapI);
            }
        }
        r(intent, iP);
    }

    static RemoteInput c(u uVar) {
        return a.b(uVar);
    }

    static RemoteInput[] d(u[] uVarArr) {
        if (uVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[uVarArr.length];
        for (int i10 = 0; i10 < uVarArr.length; i10++) {
            remoteInputArr[i10] = c(uVarArr[i10]);
        }
        return remoteInputArr;
    }

    private static Intent h(Intent intent) {
        ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return null;
        }
        ClipDescription description = clipData.getDescription();
        if (description.hasMimeType("text/vnd.android.intent") && description.getLabel().toString().contentEquals("android.remoteinput.results")) {
            return clipData.getItemAt(0).getIntent();
        }
        return null;
    }

    public static Map i(Intent intent, String str) {
        String string;
        if (Build.VERSION.SDK_INT >= 26) {
            return b.b(intent, str);
        }
        Intent intentH = h(intent);
        if (intentH == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str2 : intentH.getExtras().keySet()) {
            if (str2.startsWith("android.remoteinput.dataTypeResultsData")) {
                String strSubstring = str2.substring(39);
                if (!strSubstring.isEmpty() && (string = intentH.getBundleExtra(str2).getString(str)) != null && !string.isEmpty()) {
                    map.put(strSubstring, Uri.parse(string));
                }
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    private static String k(String str) {
        return "android.remoteinput.dataTypeResultsData" + str;
    }

    public static Bundle o(Intent intent) {
        return a.c(intent);
    }

    public static int p(Intent intent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.a(intent);
        }
        Intent intentH = h(intent);
        if (intentH == null) {
            return 0;
        }
        return intentH.getExtras().getInt("android.remoteinput.resultsSource", 0);
    }

    public static void r(Intent intent, int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            c.b(intent, i10);
            return;
        }
        Intent intentH = h(intent);
        if (intentH == null) {
            intentH = new Intent();
        }
        intentH.putExtra("android.remoteinput.resultsSource", i10);
        intent.setClipData(ClipData.newIntent("android.remoteinput.results", intentH));
    }

    public boolean e() {
        return this.f16783d;
    }

    public Set f() {
        return this.f16786g;
    }

    public CharSequence[] g() {
        return this.f16782c;
    }

    public int j() {
        return this.f16784e;
    }

    public Bundle l() {
        return this.f16785f;
    }

    public CharSequence m() {
        return this.f16781b;
    }

    public String n() {
        return this.f16780a;
    }

    public boolean q() {
        if (e()) {
            return false;
        }
        return ((g() != null && g().length != 0) || f() == null || f().isEmpty()) ? false : true;
    }
}
