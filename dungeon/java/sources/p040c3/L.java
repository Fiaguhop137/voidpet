package p040c3;

import U1.F;
import U1.K;
import android.util.SparseArray;
import java.util.Collections;
import java.util.List;
import p380v2.r;

/* JADX INFO: loaded from: classes.dex */
public interface L {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f26846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f26847b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f26848c;

        public a(String str, int i10, byte[] bArr) {
            this.f26846a = str;
            this.f26847b = i10;
            this.f26848c = bArr;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f26850b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f26851c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f26852d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f26853e;

        public b(int i10, String str, int i11, List list, byte[] bArr) {
            this.f26849a = i10;
            this.f26850b = str;
            this.f26851c = i11;
            this.f26852d = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
            this.f26853e = bArr;
        }

        public int a() {
            int i10 = this.f26851c;
            if (i10 != 2) {
                return i10 != 3 ? 0 : 512;
            }
            return 2048;
        }
    }

    public interface c {
        L a(int i10, b bVar);

        SparseArray b();
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f26854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f26855b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f26856c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f26857d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f26858e;

        public d(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + "/";
            } else {
                str = "";
            }
            this.f26854a = str;
            this.f26855b = i11;
            this.f26856c = i12;
            this.f26857d = Integer.MIN_VALUE;
            this.f26858e = "";
        }

        private void d() {
            if (this.f26857d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i10 = this.f26857d;
            this.f26857d = i10 == Integer.MIN_VALUE ? this.f26855b : i10 + this.f26856c;
            this.f26858e = this.f26854a + this.f26857d;
        }

        public String b() {
            d();
            return this.f26858e;
        }

        public int c() {
            d();
            return this.f26857d;
        }
    }

    void a();

    void b(K k10, r rVar, d dVar);

    void c(F f10, int i10);
}
