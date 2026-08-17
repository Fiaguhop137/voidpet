package expo.modules.notifications.notifications.categories;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p103fc.b;
import p103fc.c;
import p103fc.f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lexpo/modules/notifications/notifications/categories/NotificationActionRecord;", "Lfc/c;", "<init>", "()V", "", "identifier", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "getIdentifier$annotations", "buttonTitle", "getButtonTitle", "getButtonTitle$annotations", "Lexpo/modules/notifications/notifications/categories/NotificationActionRecord$TextInput;", "textInput", "Lexpo/modules/notifications/notifications/categories/NotificationActionRecord$TextInput;", "getTextInput", "()Lexpo/modules/notifications/notifications/categories/NotificationActionRecord$TextInput;", "getTextInput$annotations", "Lexpo/modules/notifications/notifications/categories/NotificationActionRecord$Options;", "options", "Lexpo/modules/notifications/notifications/categories/NotificationActionRecord$Options;", "getOptions", "()Lexpo/modules/notifications/notifications/categories/NotificationActionRecord$Options;", "getOptions$annotations", "TextInput", "Options", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NotificationActionRecord implements c {

    @Nullable
    private final TextInput textInput;

    @NotNull
    private final String identifier = "";

    @NotNull
    private final String buttonTitle = "";

    @NotNull
    private final Options options = new Options();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lexpo/modules/notifications/notifications/categories/NotificationActionRecord$Options;", "Lfc/c;", "<init>", "()V", "", "opensAppToForeground", "Z", "getOpensAppToForeground", "()Z", "getOpensAppToForeground$annotations", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Options implements c {
        private final boolean opensAppToForeground = true;

        @b
        public static /* synthetic */ void getOpensAppToForeground$annotations() {
        }

        public final boolean getOpensAppToForeground() {
            return this.opensAppToForeground;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lexpo/modules/notifications/notifications/categories/NotificationActionRecord$TextInput;", "Lfc/c;", "<init>", "()V", "", "placeholder", "Ljava/lang/String;", "getPlaceholder", "()Ljava/lang/String;", "getPlaceholder$annotations", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TextInput implements c {

        @NotNull
        private final String placeholder = "";

        @b
        @f
        public static /* synthetic */ void getPlaceholder$annotations() {
        }

        @NotNull
        public final String getPlaceholder() {
            return this.placeholder;
        }
    }

    @b
    @f
    public static /* synthetic */ void getButtonTitle$annotations() {
    }

    @b
    @f
    public static /* synthetic */ void getIdentifier$annotations() {
    }

    @b
    public static /* synthetic */ void getOptions$annotations() {
    }

    @b
    public static /* synthetic */ void getTextInput$annotations() {
    }

    @NotNull
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @NotNull
    public final String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    public final Options getOptions() {
        return this.options;
    }

    @Nullable
    public final TextInput getTextInput() {
        return this.textInput;
    }
}
