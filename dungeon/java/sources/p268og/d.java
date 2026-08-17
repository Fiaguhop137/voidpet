package p268og;

import Vf.b;
import Vf.q;
import Xf.h;

/* JADX INFO: loaded from: classes3.dex */
public class d implements b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final short[] f50681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final short[] f50682h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final short[] f50683i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f50684j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f50685k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d f50686l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f50687m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d f50688n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f50689o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f50691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f50692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f50693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f50694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f50695f;

    static {
        short[] sArr = {4643, 13363, 20579, 25843, 29227, 31145, 32103, 32525, 32689, 32745, 32762, 32766, Short.MAX_VALUE};
        f50681g = sArr;
        short[] sArr2 = {5638, 15915, 23689, 28571, 31116, 32217, 32613, 32731, 32760, 32766, Short.MAX_VALUE};
        f50682h = sArr2;
        short[] sArr3 = {9142, 23462, 30338, 32361, 32725, 32765, Short.MAX_VALUE};
        f50683i = sArr3;
        f50684j = new d("frodokem640aes", 640, 15, 2, sArr, new h(128), new c.a(640, 32768));
        f50685k = new d("frodokem640shake", 640, 15, 2, sArr, new h(128), new c.b(640, 32768));
        f50686l = new d("frodokem976aes", 976, 16, 3, sArr2, new h(256), new c.a(976, 65536));
        f50687m = new d("frodokem976shake", 976, 16, 3, sArr2, new h(256), new c.b(976, 65536));
        f50688n = new d("frodokem1344aes", 1344, 16, 4, sArr3, new h(256), new c.a(1344, 65536));
        f50689o = new d("frodokem1344shake", 1344, 16, 4, sArr3, new h(256), new c.b(1344, 65536));
    }

    private d(String str, int i10, int i11, int i12, short[] sArr, q qVar, c cVar) {
        this.f50690a = str;
        this.f50691b = i10;
        this.f50692c = i11;
        this.f50693d = i12;
        this.f50694e = i12 * 64;
        this.f50695f = new a(i10, i11, i12, sArr, qVar, cVar);
    }
}
