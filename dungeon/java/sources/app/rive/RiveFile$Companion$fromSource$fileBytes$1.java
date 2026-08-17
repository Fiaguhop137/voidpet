package app.rive;

import Ad.r;
import Ed.b;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.m;
import kotlin.io.c;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p088ef.O;

/* JADX INFO: loaded from: classes.dex */
@f(c = "app.rive.RiveFile$Companion$fromSource$fileBytes$1", f = "RiveFile.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lef/O;", "", "<anonymous>", "(Lef/O;)[B"}, k = 3, mv = {1, 9, 0})
final class RiveFile$Companion$fromSource$fileBytes$1 extends m implements Function2<O, b, Object> {
    final /* synthetic */ RiveFileSource $source;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RiveFile$Companion$fromSource$fileBytes$1(RiveFileSource riveFileSource, b bVar) {
        super(2, bVar);
        this.$source = riveFileSource;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final b create(@Nullable Object obj, @NotNull b bVar) {
        return new RiveFile$Companion$fromSource$fileBytes$1(this.$source, bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull O o10, @Nullable b bVar) {
        return ((RiveFile$Companion$fromSource$fileBytes$1) create(o10, bVar)).invokeSuspend(Unit.f48228a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws IOException {
        Fd.b.e();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r.b(obj);
        InputStream inputStreamOpenRawResource = ((RiveFileSource.RawRes) this.$source).getResources().openRawResource(((RiveFileSource.RawRes) this.$source).getResId());
        try {
            Intrinsics.c(inputStreamOpenRawResource);
            byte[] bArrC = kotlin.io.b.c(inputStreamOpenRawResource);
            c.a(inputStreamOpenRawResource, null);
            return bArrC;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c.a(inputStreamOpenRawResource, th);
                throw th2;
            }
        }
    }
}
