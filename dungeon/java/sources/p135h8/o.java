package p135h8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes2.dex */
final class o extends BasePendingResult {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final k f42667n;

    public o(f fVar, k kVar) {
        super(fVar);
        this.f42667n = kVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final k e(Status status) {
        return this.f42667n;
    }
}
