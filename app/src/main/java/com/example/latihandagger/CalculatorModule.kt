package com.example.latihandagger

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class CalculatorModule {

    @Binds
    @Singleton
    abstract fun provideCalculator(calculator: Calculator): Calculator
}