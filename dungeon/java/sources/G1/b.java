package G1;

import android.animation.Animator;
import androidx.fragment.app.C1975f;
import androidx.fragment.app.F;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements h1.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Animator f3826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F.c f3827b;

    public /* synthetic */ b(Animator animator, F.c cVar) {
        this.f3826a = animator;
        this.f3827b = cVar;
    }

    @Override // h1.d.a
    public final void onCancel() {
        C1975f.J(this.f3826a, this.f3827b);
    }
}
