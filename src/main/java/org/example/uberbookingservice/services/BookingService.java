package org.example.uberbookingservice.services;


import org.example.uberbookingservice.dto.CreateBookingDto;
import org.example.uberbookingservice.dto.CreateBookingResponseDto;
import org.example.uberbookingservice.dto.UpdateBookingRequestDto;
import org.example.uberbookingservice.dto.UpdateBookingResponseDto;
import org.example.uberprojectentityservice.models.Booking;
import org.springframework.stereotype.Service;

@Service
public interface BookingService {
    public CreateBookingResponseDto createBooking(CreateBookingDto bookingDetails);

    public UpdateBookingResponseDto updateBooking(Long bookingId,UpdateBookingRequestDto updateBookingRequestDto);
}
