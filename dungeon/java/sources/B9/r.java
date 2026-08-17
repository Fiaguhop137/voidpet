package B9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f622d;

    class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f623a;

        /* JADX INFO: renamed from: B9.r$a$a, reason: collision with other inner class name */
        class C0013a extends b {
            C0013a(r rVar, CharSequence charSequence) {
                super(rVar, charSequence);
            }

            @Override // B9.r.b
            int f(int i10) {
                return i10 + 1;
            }

            @Override // B9.r.b
            int g(int i10) {
                return a.this.f623a.c(this.f625c, i10);
            }
        }

        a(d dVar) {
            this.f623a = dVar;
        }

        @Override // B9.r.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(r rVar, CharSequence charSequence) {
            return new C0013a(rVar, charSequence);
        }
    }

    private static abstract class b extends B9.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final CharSequence f625c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final d f626d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f627e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f628f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f629g;

        protected b(r rVar, CharSequence charSequence) {
            this.f626d = rVar.f619a;
            this.f627e = rVar.f620b;
            this.f629g = rVar.f622d;
            this.f625c = charSequence;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // B9.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String a() {
            int i10 = this.f628f;
            while (true) {
                int i11 = this.f628f;
                if (i11 == -1) {
                    return (String) b();
                }
                int iG = g(i11);
                if (iG == -1) {
                    iG = this.f625c.length();
                    this.f628f = -1;
                } else {
                    this.f628f = f(iG);
                }
                int i12 = this.f628f;
                if (i12 == i10) {
                    int i13 = i12 + 1;
                    this.f628f = i13;
                    if (i13 > this.f625c.length()) {
                        this.f628f = -1;
                    }
                } else {
                    while (i10 < iG && this.f626d.e(this.f625c.charAt(i10))) {
                        i10++;
                    }
                    while (iG > i10 && this.f626d.e(this.f625c.charAt(iG - 1))) {
                        iG--;
                    }
                    if (!this.f627e || i10 != iG) {
                        int i14 = this.f629g;
                        if (i14 == 1) {
                            iG = this.f625c.length();
                            this.f628f = -1;
                            while (iG > i10 && this.f626d.e(this.f625c.charAt(iG - 1))) {
                                iG--;
                            }
                        } else {
                            this.f629g = i14 - 1;
                        }
                        return this.f625c.subSequence(i10, iG).toString();
                    }
                    i10 = this.f628f;
                }
            }
        }

        abstract int f(int i10);

        abstract int g(int i10);
    }

    private interface c {
        Iterator a(r rVar, CharSequence charSequence);
    }

    private r(c cVar) {
        this(cVar, false, d.f(), Integer.MAX_VALUE);
    }

    private r(c cVar, boolean z10, d dVar, int i10) {
        this.f621c = cVar;
        this.f620b = z10;
        this.f619a = dVar;
        this.f622d = i10;
    }

    public static r d(char c10) {
        return e(d.d(c10));
    }

    public static r e(d dVar) {
        n.j(dVar);
        return new r(new a(dVar));
    }

    private Iterator g(CharSequence charSequence) {
        return this.f621c.a(this, charSequence);
    }

    public List f(CharSequence charSequence) {
        n.j(charSequence);
        Iterator itG = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itG.hasNext()) {
            arrayList.add((String) itG.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
