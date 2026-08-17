package p308r2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Comparator f52111h = new p();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator f52112i = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f52113a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f52117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f52118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f52119g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b[] f52115c = new b[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f52114b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f52116d = -1;

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f52120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f52121b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f52122c;

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public r(int i10) {
        this.f52113a = i10;
    }

    public static /* synthetic */ int b(b bVar, b bVar2) {
        return bVar.f52120a - bVar2.f52120a;
    }

    private void d() {
        if (this.f52116d != 1) {
            Collections.sort(this.f52114b, f52111h);
            this.f52116d = 1;
        }
    }

    private void e() {
        if (this.f52116d != 0) {
            Collections.sort(this.f52114b, f52112i);
            this.f52116d = 0;
        }
    }

    public void c(int i10, float f10) {
        b bVar;
        d();
        int i11 = this.f52119g;
        if (i11 > 0) {
            b[] bVarArr = this.f52115c;
            int i12 = i11 - 1;
            this.f52119g = i12;
            bVar = bVarArr[i12];
        } else {
            bVar = new b(null);
        }
        int i13 = this.f52117e;
        this.f52117e = i13 + 1;
        bVar.f52120a = i13;
        bVar.f52121b = i10;
        bVar.f52122c = f10;
        this.f52114b.add(bVar);
        this.f52118f += i10;
        while (true) {
            int i14 = this.f52118f;
            int i15 = this.f52113a;
            if (i14 <= i15) {
                return;
            }
            int i16 = i14 - i15;
            b bVar2 = (b) this.f52114b.get(0);
            int i17 = bVar2.f52121b;
            if (i17 <= i16) {
                this.f52118f -= i17;
                this.f52114b.remove(0);
                int i18 = this.f52119g;
                if (i18 < 5) {
                    b[] bVarArr2 = this.f52115c;
                    this.f52119g = i18 + 1;
                    bVarArr2[i18] = bVar2;
                }
            } else {
                bVar2.f52121b = i17 - i16;
                this.f52118f -= i16;
            }
        }
    }

    public float f(float f10) {
        e();
        float f11 = f10 * this.f52118f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f52114b.size(); i11++) {
            b bVar = (b) this.f52114b.get(i11);
            i10 += bVar.f52121b;
            if (i10 >= f11) {
                return bVar.f52122c;
            }
        }
        if (this.f52114b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList arrayList = this.f52114b;
        return ((b) arrayList.get(arrayList.size() - 1)).f52122c;
    }

    public void g() {
        this.f52114b.clear();
        this.f52116d = -1;
        this.f52117e = 0;
        this.f52118f = 0;
    }
}
