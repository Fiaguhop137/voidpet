package p135h8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes2.dex */
final class p extends BasePendingResult {
    public p(f fVar) {
        super(fVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final k e(Status status) {
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
