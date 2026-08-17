package app.rive.runtime.kotlin.core;

import com.android.volley.k;
import com.android.volley.m;
import com.android.volley.n;
import com.android.volley.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p166j4.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0014"}, d2 = {"Lapp/rive/runtime/kotlin/core/BytesRequest;", "Lcom/android/volley/n;", "", "", "url", "Lkotlin/Function1;", "", "onResponse", "Lcom/android/volley/p$a;", "errorListener", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/android/volley/p$a;)V", "response", "deliverResponse", "([B)V", "Lcom/android/volley/k;", "Lcom/android/volley/p;", "parseNetworkResponse", "(Lcom/android/volley/k;)Lcom/android/volley/p;", "Lkotlin/jvm/functions/Function1;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BytesRequest extends n {
    public static final int $stable = 0;

    @NotNull
    private final Function1<byte[], Unit> onResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BytesRequest(@NotNull String url, @NotNull Function1<? super byte[], Unit> onResponse, @NotNull p.a errorListener) {
        super(0, url, errorListener);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(onResponse, "onResponse");
        Intrinsics.checkNotNullParameter(errorListener, "errorListener");
        this.onResponse = onResponse;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.n
    public void deliverResponse(@NotNull byte[] response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.onResponse.invoke(response);
    }

    @Override // com.android.volley.n
    @NotNull
    protected p parseNetworkResponse(@Nullable k response) {
        byte[] bArr;
        if (response != null) {
            try {
                bArr = response.f27880b;
            } catch (Exception e10) {
                p pVarA = p.a(new m(e10));
                Intrinsics.c(pVarA);
                return pVarA;
            }
        } else {
            bArr = null;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        p pVarC = p.c(bArr, e.e(response));
        Intrinsics.c(pVarC);
        return pVarC;
    }
}
