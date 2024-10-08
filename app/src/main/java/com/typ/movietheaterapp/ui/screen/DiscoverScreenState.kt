package com.typ.movietheaterapp.ui.screen

import com.typ.movietheaterapp.data.FeatureMoviesData
import com.typ.movietheaterapp.data.FeaturedMovieState
import com.typ.movietheaterapp.data.MovieThumbnailState
import com.typ.movietheaterapp.data.RecentlyWatchedMoviesData
import com.typ.movietheaterapp.data.StreamingMoviesData
import com.typ.movietheaterapp.data.UpcomingMoviesData

data class DiscoverScreenState (
    val featureMovies: List<FeaturedMovieState> = FeatureMoviesData,
    val upcomingMovies: List<MovieThumbnailState> = UpcomingMoviesData,
    val recentlyWatchedMovies: List<MovieThumbnailState> = RecentlyWatchedMoviesData,
    val streamingMovies: List<MovieThumbnailState> = StreamingMoviesData

)