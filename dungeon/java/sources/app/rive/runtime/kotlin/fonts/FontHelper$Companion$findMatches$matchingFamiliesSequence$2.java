package app.rive.runtime.kotlin.fonts;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lapp/rive/runtime/kotlin/fonts/Fonts$Family;", "it", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class FontHelper$Companion$findMatches$matchingFamiliesSequence$2 extends o implements Function1<Map.Entry<? extends String, ? extends Fonts.Family>, Fonts.Family> {
    public static final FontHelper$Companion$findMatches$matchingFamiliesSequence$2 INSTANCE = new FontHelper$Companion$findMatches$matchingFamiliesSequence$2();

    FontHelper$Companion$findMatches$matchingFamiliesSequence$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Fonts.Family invoke(@NotNull Map.Entry<String, Fonts.Family> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getValue();
    }
}
