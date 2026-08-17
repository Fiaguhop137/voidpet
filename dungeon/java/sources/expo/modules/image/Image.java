package expo.modules.image;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import expo.modules.kotlin.sharedobjects.SharedRef;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lexpo/modules/image/Image;", "Lexpo/modules/kotlin/sharedobjects/SharedRef;", "Landroid/graphics/drawable/Drawable;", "ref", "<init>", "(Landroid/graphics/drawable/Drawable;)V", "", "c", "()I", "", "e", "Ljava/lang/String;", "t", "()Ljava/lang/String;", "nativeRefType", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Image extends SharedRef<Drawable> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String nativeRefType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Image(Drawable ref) {
        super(ref, null, 2, null);
        Intrinsics.checkNotNullParameter(ref, "ref");
        this.nativeRefType = "image";
    }

    @Override // expo.modules.kotlin.sharedobjects.SharedObject
    public int c() {
        Drawable drawable = (Drawable) getRef();
        return drawable instanceof BitmapDrawable ? ((BitmapDrawable) drawable).getBitmap().getAllocationByteCount() : drawable.getIntrinsicWidth() * drawable.getIntrinsicHeight();
    }

    @Override // expo.modules.kotlin.sharedobjects.SharedRef
    /* JADX INFO: renamed from: t, reason: from getter */
    public String getNativeRefType() {
        return this.nativeRefType;
    }
}
