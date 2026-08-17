package L8;

import com.google.android.gms.common.api.internal.AbstractC2326t;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class M implements InterfaceC1150g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f6436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f6437b;

    /* synthetic */ M(String str, int i10) {
        this.f6436a = str;
        this.f6437b = i10;
    }

    @Override // L8.InterfaceC1150g
    public final /* synthetic */ Task a(p135h8.e eVar) {
        return eVar.k(AbstractC2326t.a().b(new N(this.f6436a, this.f6437b)).e(6696).a());
    }
}
