package io.github.sangsoonam.autovalue_parceladapter.model.autovalue_without_parcel_adapter;

import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.google.auto.value.AutoValue;

import java.util.List;

@AutoValue
public abstract class Album implements Parcelable {

    @NonNull public abstract String title();
    @NonNull public abstract List<Artist> artists();
    @Nullable public abstract String description();
    @NonNull public abstract String image();

    public static Album create(String title, List<Artist> artists, String description, String image) {
        return new AutoValue_Album(title, artists, description, image);
    }
}
