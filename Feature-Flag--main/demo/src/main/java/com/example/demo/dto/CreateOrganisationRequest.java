package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;

public record CreateOrganisationRequest ( @NotBlank  String name){}
