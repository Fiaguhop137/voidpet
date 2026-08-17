package androidx.core.view;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f23147a;

    private static class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ScrollFeedbackProvider f23148a;

        b(View view) {
            this.f23148a = ScrollFeedbackProvider.createProvider(view);
        }

        @Override // androidx.core.view.M.d
        public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
            this.f23148a.onScrollLimit(i10, i11, i12, z10);
        }

        @Override // androidx.core.view.M.d
        public void onScrollProgress(int i10, int i11, int i12, int i13) {
            this.f23148a.onScrollProgress(i10, i11, i12, i13);
        }
    }

    private static class c implements d {
        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        @Override // androidx.core.view.M.d
        public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
        }

        @Override // androidx.core.view.M.d
        public void onScrollProgress(int i10, int i11, int i12, int i13) {
        }
    }

    private interface d {
        void onScrollLimit(int i10, int i11, int i12, boolean z10);

        void onScrollProgress(int i10, int i11, int i12, int i13);
    }

    private M(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f23147a = new b(view);
        } else {
            this.f23147a = new c(null);
        }
    }

    public static M a(View view) {
        return new M(view);
    }

    public void b(int i10, int i11, int i12, boolean z10) {
        this.f23147a.onScrollLimit(i10, i11, i12, z10);
    }

    public void c(int i10, int i11, int i12, int i13) {
        this.f23147a.onScrollProgress(i10, i11, i12, i13);
    }
}
