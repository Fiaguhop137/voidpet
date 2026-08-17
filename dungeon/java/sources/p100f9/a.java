package p100f9;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Chip f41819a;

    public /* synthetic */ a(Chip chip) {
        this.f41819a = chip;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        Chip.b(this.f41819a, compoundButton, z10);
    }
}
