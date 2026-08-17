package L8;

import com.google.android.gms.common.api.internal.InterfaceC2323p;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class P implements InterfaceC2323p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f6441a;

    /* synthetic */ P(String str) {
        this.f6441a = str;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2323p
    public final /* synthetic */ void accept(Object obj, Object obj2) {
        ((p404w8.c) obj).m0((TaskCompletionSource) obj2, this.f6441a);
    }
}
