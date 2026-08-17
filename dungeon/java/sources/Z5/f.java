package Z5;

import V4.k;
import V4.p;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f18797g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Y4.a f18798h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18793c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f18792b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f18794d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f18796f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f18795e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f18791a = 0;

    public f(Y4.a aVar) {
        this.f18798h = (Y4.a) k.g(aVar);
    }

    private boolean a(InputStream inputStream) throws Throwable {
        int i10;
        int i11 = this.f18795e;
        while (this.f18791a != 6 && (i10 = inputStream.read()) != -1) {
            try {
                int i12 = this.f18793c;
                this.f18793c = i12 + 1;
                if (this.f18797g) {
                    this.f18791a = 6;
                    this.f18797g = false;
                    return false;
                }
                int i13 = this.f18791a;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 != 3) {
                                if (i13 == 4) {
                                    this.f18791a = 5;
                                } else if (i13 != 5) {
                                    k.i(false);
                                } else {
                                    int i14 = ((this.f18792b << 8) + i10) - 2;
                                    p060d5.d.a(inputStream, i14);
                                    this.f18793c += i14;
                                    this.f18791a = 2;
                                }
                            } else if (i10 == 255) {
                                this.f18791a = 3;
                            } else if (i10 == 0) {
                                this.f18791a = 2;
                            } else if (i10 == 217) {
                                this.f18797g = true;
                                f(i12 - 1);
                                this.f18791a = 2;
                            } else {
                                if (i10 == 218) {
                                    f(i12 - 1);
                                }
                                if (b(i10)) {
                                    this.f18791a = 4;
                                } else {
                                    this.f18791a = 2;
                                }
                            }
                        } else if (i10 == 255) {
                            this.f18791a = 3;
                        }
                    } else if (i10 == 216) {
                        this.f18791a = 2;
                    } else {
                        this.f18791a = 6;
                    }
                } else if (i10 == 255) {
                    this.f18791a = 1;
                } else {
                    this.f18791a = 6;
                }
                this.f18792b = i10;
            } catch (IOException e10) {
                p.a(e10);
            }
        }
        return (this.f18791a == 6 || this.f18795e == i11) ? false : true;
    }

    private static boolean b(int i10) {
        if (i10 == 1) {
            return false;
        }
        return ((i10 >= 208 && i10 <= 215) || i10 == 217 || i10 == 216) ? false : true;
    }

    private void f(int i10) {
        int i11 = this.f18794d;
        if (i11 > 0) {
            this.f18796f = i10;
        }
        this.f18794d = i11 + 1;
        this.f18795e = i11;
    }

    public int c() {
        return this.f18796f;
    }

    public int d() {
        return this.f18795e;
    }

    public boolean e() {
        return this.f18797g;
    }

    public boolean g(p025b6.k kVar) {
        if (this.f18791a == 6 || kVar.p() <= this.f18793c) {
            return false;
        }
        Y4.g gVar = new Y4.g(kVar.m(), (byte[]) this.f18798h.get(16384), this.f18798h);
        try {
            p060d5.d.a(gVar, this.f18793c);
            return a(gVar);
        } catch (IOException e10) {
            p.a(e10);
            return false;
        } finally {
            V4.b.b(gVar);
        }
    }
}
