package Q2;

import U1.AbstractC1459a;
import U1.F;
import java.util.Arrays;
import p380v2.AbstractC4255s;
import p380v2.InterfaceC4254q;

/* JADX INFO: loaded from: classes.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f9290a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F f9291b = new F(new byte[65025], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9292c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f9293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f9294e;

    e() {
    }

    private int a(int i10) {
        int i11;
        int i12 = 0;
        this.f9293d = 0;
        do {
            int i13 = this.f9293d;
            int i14 = i10 + i13;
            f fVar = this.f9290a;
            if (i14 >= fVar.f9301g) {
                break;
            }
            int[] iArr = fVar.f9304j;
            this.f9293d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public f b() {
        return this.f9290a;
    }

    public F c() {
        return this.f9291b;
    }

    public boolean d(InterfaceC4254q interfaceC4254q) {
        int i10;
        AbstractC1459a.g(interfaceC4254q != null);
        if (this.f9294e) {
            this.f9294e = false;
            this.f9291b.W(0);
        }
        while (!this.f9294e) {
            if (this.f9292c < 0) {
                if (!this.f9290a.c(interfaceC4254q) || !this.f9290a.a(interfaceC4254q, true)) {
                    return false;
                }
                f fVar = this.f9290a;
                int iA = fVar.f9302h;
                if ((fVar.f9296b & 1) == 1 && this.f9291b.j() == 0) {
                    iA += a(0);
                    i10 = this.f9293d;
                } else {
                    i10 = 0;
                }
                if (!AbstractC4255s.f(interfaceC4254q, iA)) {
                    return false;
                }
                this.f9292c = i10;
            }
            int iA2 = a(this.f9292c);
            int i11 = this.f9292c + this.f9293d;
            if (iA2 > 0) {
                F f10 = this.f9291b;
                f10.d(f10.j() + iA2);
                if (!AbstractC4255s.e(interfaceC4254q, this.f9291b.f(), this.f9291b.j(), iA2)) {
                    return false;
                }
                F f11 = this.f9291b;
                f11.Z(f11.j() + iA2);
                this.f9294e = this.f9290a.f9304j[i11 + (-1)] != 255;
            }
            if (i11 == this.f9290a.f9301g) {
                i11 = -1;
            }
            this.f9292c = i11;
        }
        return true;
    }

    public void e() {
        this.f9290a.b();
        this.f9291b.W(0);
        this.f9292c = -1;
        this.f9294e = false;
    }

    public void f() {
        if (this.f9291b.f().length == 65025) {
            return;
        }
        F f10 = this.f9291b;
        f10.Y(Arrays.copyOf(f10.f(), Math.max(65025, this.f9291b.j())), this.f9291b.j());
    }
}
