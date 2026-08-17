package L8;

import com.google.android.gms.common.api.internal.InterfaceC2323p;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class N implements InterfaceC2323p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f6438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f6439b;

    /* synthetic */ N(String str, int i10) {
        this.f6438a = str;
        this.f6439b = i10;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2323p
    public final /* synthetic */ void accept(Object obj, Object obj2) {
        ((p404w8.c) obj).o0((TaskCompletionSource) obj2, this.f6438a, this.f6439b);
    }
}
